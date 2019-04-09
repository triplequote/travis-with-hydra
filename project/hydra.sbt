// If you'd like to compile with Hydra both on the CI and during development, simply remove the if-else expression.
// Travis automatically sets a CI environment variable to "true" (https://docs.travis-ci.com/user/environment-variables/#default-environment-variables)
// This setup supports a mix of users compiling the project, some using the Hydra compiler and others using the vanilla Scala compiler. Users that want
// to use Hydra to compile this project during development can simply add the sbt-hydra plugin to their global sbt plugins (https://www.scala-sbt.org/1.x/docs/Using-Plugins.html#Global+plugins).

resolvers += Resolver.url("Triplequote Plugins Releases",
  url("https://repo.triplequote.com/artifactory/sbt-plugins-release/"))(Resolver.ivyStylePatterns)

def isCI = sys.env.get("CI") == Some("true")
// This is needed to compile PRs originating from forks, as they are not allowed to access the secret LICENSE environment.
// See https://docs.travis-ci.com/user/pull-requests/#pull-requests-and-security-restrictions
def isPullRequestFromMainRepo: Boolean = sys.env.get("TRAVIS_PULL_REQUEST_SLUG") == Some("triplequote/travis-with-hydra")

if (isCI && isPullRequestFromMainRepo) {
  // Visit https://docs.triplequote.com/ for the latest released version of Hydra
  addSbtPlugin("com.triplequote" % "sbt-hydra" % "2.1.2")
}
else Seq.empty
