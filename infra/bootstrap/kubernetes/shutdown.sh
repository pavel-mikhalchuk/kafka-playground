#!/bin/bash

echo "Destroying K8S ..."
printf 'yes\n' | terraform destroy  

echo "Done!"