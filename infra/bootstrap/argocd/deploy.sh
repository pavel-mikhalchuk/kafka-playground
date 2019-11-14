#!/bin/bash

echo "Deploying Argo CD and apps ..."

kubectl create ns argocd
kubectl -n argocd apply -f argocd-v1.2.4-install.yaml

sleep 60

kubectl -n argocd apply -f app-of-apps.yaml

kubectl get pods -n argocd -l app.kubernetes.io/name=argocd-server -o name | cut -d'/' -f 2 

echo "Done!"