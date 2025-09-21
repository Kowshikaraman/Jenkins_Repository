pipeline{
    agent any // { label "slave1" }
    parameters{
        choice(
            name:"EXECUTION_TYPE",
            choices:["Sample Jenkins Script","Declarative Pipeline","Scriptive Pipeline","Parallelization","CRON Job"],
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

                        echo "Removed workspace folder... ${cleanWrkspace}"

                        bat "mkdir workspace"


                        echo "Added workspace folder... ${cleanWrkspace}"
                    }else{
                        bat "mkdir workspace"


                        echo "Added workspace folder by level2..."
                    }
                }
            }
        }
        stage("Execute the respective pipeline script..."){
            steps{
                script{

                // dir("workspace"){
                switch(params.EXECUTION_TYPE) {
                    case "Sample Jenkins Script":
                        def basicJenkins = load "demo-jenkins/demojenkins.groovy"
                        basicJenkins.execute()
                        // build job: 'demo-jenkins/Jenkins.groovy', wait: true
                    break
                    case "Scriptive Pipeline":
                        def scriptRef = load "scripted-pipeline/scriptedpipeline.groovy"
                    break
                    case "Declarative Pipeline":
                        def descPipeline = load "descriptive-pipeline/descriptivepipeline.groovy"
                    break
                    case "CRON Job":
                        build job: "CRON-job/cronjobpipeline.groovy"
                    break
                }
                // }

                }
            }
        }
    }
}