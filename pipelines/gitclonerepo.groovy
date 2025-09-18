def run(String repoUrl, String branch, String folder) {
    echo "📥 Cloning ${repoUrl} (branch: ${branch}) into ${folder}"
    // deleteDir()
        bat '''
        if exist ExpressJSApp (
        rmdir /S /Q ExpressJSApp
        )
        '''    // Detect OS
        bat "git clone -b ${branch} ${repoUrl} ${folder}"
}

return this
