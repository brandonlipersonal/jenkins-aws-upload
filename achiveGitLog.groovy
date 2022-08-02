node {
  stage('Archive Git Log') {
<<<<<<< HEAD
    sh """
          git log
       """
=======
        sh """
             ls -al
             git log > git.log
            """
>>>>>>> be5caf41e40723914cdf37d01f3fb7088f6bedb3
    
    archiveArtifacts artifacts: "git.log", fingerprint: true
  }
}
