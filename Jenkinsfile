pipeline{
    agent any
    stages{
        stage("Git Clone Repo...."){
            steps{
                script{
                    def gitClone = load "pipelines/gitclonerepo.groovy"
                    gitClone.run("https://github.com/Kowshikaraman/my_personal_project", "main", "my-repo-folder")
                }
            }

        }
    }
}