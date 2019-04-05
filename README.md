# Travis with Triplequote Hydra
[![Hydra](https://img.shields.io/badge/%22%22%22%7CHydra-4%20cpus-brightgreen.svg)](https://www.triplequote.com/hydra)

This repository showcases and explains how to set up Travis to compile a sbt Scala project using the [Triplequote Hydra parallel compiler](https://triplequote.com/).

# Setup

Start by [requesting a free Hydra Server trial license](https://triplequote.com/hydra/trial) or contact us at [ping@triplequote.com](mailto:ping@triplequote.com) to obtain a [Hydra Open Source project license](#hydra-open-source-project-license).

The setup assumes your project is already configured to use TravisCI. If not, please read the [getting started](https://docs.travis-ci.com/user/tutorial/) to setup your project to build with TravisCI.

1. Add [project/hydra.sbt](https://github.com/dotta/travis-with-hydra/blob/master/project/hydra.sbt) to your project.

2. Create a secret $LICENSE environment variable that will old your Hydra Server license key. Next is the command to execute from inside the project folder (see https://docs.travis-ci.com/user/environment-variables/#encrypting-environment-variables):

```bash 
$ travis encrypt LICENSE="floating-key=XXXXX-XXXXX-XXXXX-XXXXX-XXXXX" --add env.matrix
```

3. Add a build step in the `.travis.yml` so that the hydra.license file is created in the expected place:

```
script:
  - mkdir -p $HOME/.triplequote && echo "$LICENSE" > "$HOME/.triplequote/hydra.license"
```

Mind that this should be done before any all steps compiling Scala. Look at [this repo's .travis.yml](https://github.com/triplequote/travis-with-hydra/blob/master/.travis.yml) for an example.

4. Commit the changes to your `.travis.yml`.

You are all set to compile Scala with Hydra on Travis!

# Hydra Open Source project license
A Hydra OSS license is granted to developers of non-commercial Open Source projects, with an established and active community. The license is free. However, we ask you to add a reference to Triplequote website on the web pages of your Open Source project (in particular, the README, documentation and product homepages).

Also, we kindly ask you to help us grow awarness and excitement in the community (e.g., blogging or twitter - [@triple_quote](https://twitter.com/triple_quote) is our handle).
