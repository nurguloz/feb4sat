package com.example.basicchatapp

class User {
    var username: String? = null
    var email: String? = null
    var uid: String? = null

    constructor(){}

    constructor(name: String?, email: String?, uid: String?){
        this.username = name
        this.email = email
        this.uid = uid
    }
}