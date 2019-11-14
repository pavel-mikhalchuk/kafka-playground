#!/bin/bash

cd kubernetes
./spinup.sh
cd ..

cd argocd
./deploy.sh
cd ..