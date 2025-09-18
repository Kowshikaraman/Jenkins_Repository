def build(){
    def cmdExe = bat """cd ExpressJSApp"""
    dir("ExpressJSApp"){
        bat """docker build -t ExpressApp:1.0.1 . """
    }
}