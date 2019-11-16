kill -9 $(lsof -nP -i4TCP:8080 | grep LISTEN | awk '{print $2}')
nohup kubectl port-forward svc/argocd-server -n argocd 8080:443 </dev/null >/dev/null 2>&1 &