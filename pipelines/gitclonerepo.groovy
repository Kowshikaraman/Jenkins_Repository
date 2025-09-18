def run(String repoUrl, String branch) {
    echo "📥 Cloning ${repoUrl} (branch: ${branch}) into Workspace"

    // Detect OS
    if (isUnix()) {
        // Linux / macOS
        sh "git clone -b ${branch} ${repoUrl} ."
    } else {
        // Windows
        deleteDir()
        bat "git clone -b ${branch} ${repoUrl} ."
    }

    //     checkout([
    //     $class: 'GitSCM',
    //     branches: [[name: branch]],
    //     doGenerateSubmoduleConfigurations: false,
    //     extensions: [
    //         [$class: 'CloneOption', depth: 1, shallow: true, noTags: false, timeout: 10]
    //     ],
    //     userRemoteConfigs: [[url: repoUrl]]
    // ])
}

return this
