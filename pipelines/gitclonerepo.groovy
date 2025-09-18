def run(String repoUrl, String branch = "main", String targetDir = "repo") {
    echo "📥 Cloning ${repoUrl} (branch: ${branch}) into ${targetDir}"
    sh """
        rm -rf ${targetDir}
        git clone --branch ${branch} ${repoUrl} ${targetDir}
    """
}
return this
