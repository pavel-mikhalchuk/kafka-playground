kubectl create ns argocd
kubectl -n argocd apply -f argocd-v1.2.4-install.yaml
kubectl get pods -n argocd -l app.kubernetes.io/name=argocd-server -o name | cut -d'/' -f 2 