#!/bin/bash

set -e

echo "Creating K8S ..."
printf 'yes\n' | terraform apply

echo "Connecting to the cluster ..."
gcloud container clusters get-credentials kafka-playground --zone us-central1-a --project kafka-playground-666

echo "Done!"

set +e