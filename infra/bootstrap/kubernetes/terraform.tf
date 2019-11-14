resource "google_container_cluster" "k8s_terraform" {
  project                = "kafka-playground-666"
  name                   = "kafka-playground"
  location               = "us-central1-a"
  min_master_version     = "1.14.8-gke.12"
  node_version           = "1.14.8-gke.12"
  initial_node_count     = 4
  
  master_auth {
    client_certificate_config {
      issue_client_certificate = false
    }
  }

  node_config {
    oauth_scopes = [
      "https://www.googleapis.com/auth/logging.write",
      "https://www.googleapis.com/auth/monitoring",
    ]

    metadata = {
      disable-legacy-endpoints = "true"
    }
  }

  timeouts {
    create = "5m"
    update = "5m"
  }
}