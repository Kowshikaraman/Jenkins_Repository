def build(){
    def cmdExe = bat """cd ExpressJSApp"""
    dir("ExpressJSApp"){
        bat """docker build -t expressapp:1.0.1 . """
    }
}
return this