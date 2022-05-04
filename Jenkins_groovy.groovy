def createYAML(apiVersion, environment, appFamily, appName, version, buildID, deploymentType){
  stage('Create Yaml'){
                        sh """
                        cat << EOF > Jenkins.yaml 
                         apiVersion: v1
                         environment: dev
                         version: 1.0.0
                         buildID: xyz
                         kind: deployment
                         manifest:
                          - application.jar
                          - Jenkins.yaml
                          - dockerfile
                          - MD5NUM
                         deployment:
                          type: container
                          target: EKS
                          style: non-intrusive
                          window: asap
                        #Optional Fields
                          healthcheckURI: ":80/irmod/test.html"
                        EOF
                    """
    }
  stage('Check YAML'){
    cat Jenkins.yaml
}
}



