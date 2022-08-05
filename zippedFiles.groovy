<<<<<<< HEAD
packageFile = ProjectName +"-package"+".zip"

=======
>>>>>>> e1634185ac73894e53ac14f5b6d9d48ecb39fe94
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