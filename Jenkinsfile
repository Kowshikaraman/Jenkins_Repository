pipeline{
    agent { label "slave1" }
    parameters{
        choice(
            name:"EXECUTION_TYPE",
            choices:["Sample Jenkins Script","Declarative Pipeline","Scriptive Pipeline","Parallelization"],
            description:"Select the type of pipeline to execute"
        )
    }
    stages{
        stage("Validate and Clean Workspace...."){
            steps{
                script{
                    // def workspace =  new File("${env.WORKSPACE}/workspace")

                    if (fileExists('workspace')) {
                        def cleanWrkspace = bat(
                            script:"rmdir workspace",
                            returnStatus:true
                        )
                    }
                }
            }
        }
        stage("Execute the respective pipeline script..."){
            steps{
                script{

                }
            }
        }
    }
}