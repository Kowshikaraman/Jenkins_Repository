def run(String repoUrl, String branch, String folder) {
    echo "📥 Cloning ${repoUrl} (branch: ${branch}) into ${folder}"

    // Detect OS
    if (isUnix()) {
        // Linux / macOS
        sh "git clone -b ${branch} ${repoUrl} ${folder}"
    } else {
        // Windows
        bat "git clone -b ${branch} ${repoUrl} ${folder}"
    }
}

return this
