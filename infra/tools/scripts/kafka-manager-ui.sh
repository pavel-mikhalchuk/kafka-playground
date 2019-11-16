
export POD_NAME=$(kubectl get pods --namespace kafka -l "app=kafka-manager,release=kafka-manager" -o jsonpath="{.items[0].metadata.name}")
nohup kubectl -n kafka port-forward $POD_NAME 8081:9000 </dev/null >/dev/null 2>&1 &