// def run() {
//     node {
//         stage("Hello World...") {
//             script {
//                 def helloWorld = "Welcome!! This is my new message!!!"
//                 echo "${helloWorld}"
//             }
//         }
//     }
// }

// return this


def run() {
    stage("Hello World") {
        echo "Welcome!! This is my new message!!!"
    }
}
return this