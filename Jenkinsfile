pipeline{
    agent any
    stages{
        stage("Git Clone Repo...."){
           def gitClone =  load "pipelines/gitclonerepo.groovy"
           gitClone.run()
        }
    }
}