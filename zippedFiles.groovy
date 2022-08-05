

node {
  stage('Zipping 3 files') {
        sh """
            ls -al
            zip -r ${packageFile} ex1.txt
            zip -r ${packageFile} ex2.txt
            cat ${packageFile}
            """
  }
}
