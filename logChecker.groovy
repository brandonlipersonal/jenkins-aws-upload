# def logChecker() {
#   Stage('Files have been checked and they are null or missing') {
#     catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
#       sh "exit 1"
#   }
#   echo "Must be a valid file"
#   }
# }

def activeLog = 'false'
while (activeLog == 'false')
    sh ""
    if [ -s ex1.txt ]; then
        echo "File exists and is not empty"
        activeLog = 'true'
    else
        echo "File does not exist or is null, the pipeline will now stop..."
        logChecker()
    fi
    ""
        