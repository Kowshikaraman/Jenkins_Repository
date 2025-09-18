def repoUrl = "https://github.com/Kowshikaraman/my_personal_project"
def branch = "main"

println "📥 Cloning ${repoUrl} (branch: ${branch})"
def proc = ["bash", "-c", "git clone --branch ${branch} ${repoUrl}"].execute()
proc.waitForProcessOutput(System.out, System.err)