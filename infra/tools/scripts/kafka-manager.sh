export POD_NAME=$(kubectl get pods --namespace default -l "app=kafka-manager,release=nonplussed-mastiff" -o jsonpath="{.items[0].metadata.name}")
kubectl port-forward $POD_NAME 8081:9000
