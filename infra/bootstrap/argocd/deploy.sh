kubectl create ns argocd
kubectl -n argocd apply -f argocd-v1.2.4-install.yaml
kubectl -n argocd apply -f app-of-apps.yaml 
