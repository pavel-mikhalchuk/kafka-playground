#!/bin/bash

app=cp-schema-registry
chart_path="$(pwd)/../../../../cp-helm-charts/charts/cp-schema-registry"
release=kafka
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
mkdir -p tmp/$app

cp -r $chart_path/* ./tmp/$app
helm template --name $release --namespace=$namespace --output-dir . --values $helm/values.yaml ./tmp/$app

mv $app/* ./
rm -rf $app
rm -rf tmp