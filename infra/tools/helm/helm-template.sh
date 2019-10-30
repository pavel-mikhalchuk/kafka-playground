#!/bin/bash

repo=stable
app=kafka-manager
release=kafka-manager
version=2.2.0
namespace=kafka
workdir="$(pwd)/../../state/$app/"

helm=$workdir/helm
generated_manifests=$workdir/raw-manifests/helm-generated

# Helm values.yaml
mkdir -p $helm
touch $helm/values.yaml

# K8S raw-manifests
rm -rf $generated_manifests
mkdir -p $generated_manifests

cd $generated_manifests
mkdir tmp
helm fetch --untar --untardir=./tmp $repo/$app --version $version
helm template --name $release --namespace=$namespace --output-dir . --values $helm/values.yaml ./tmp/$app
mv $app/* ./
rm -rf $app
rm -rf tmp