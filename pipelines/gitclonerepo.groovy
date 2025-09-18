def run(String repoUrl, String branch) {
    echo "📥 Cloning ${repoUrl} (branch: ${branch}) into Workspace"

    // Detect OS
    if (isUnix()) {
        // Linux / macOS
        sh "git clone -b ${branch} ${repoUrl} ."
    } else {
        // Windows
        bat "git clone -b ${branch} ${repoUrl} ."
    }
}

return this
