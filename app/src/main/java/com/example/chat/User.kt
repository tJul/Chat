package com.example.chat

import android.os.Parcel
import android.os.Parcelable

class User(): Parcelable {
    private lateinit var email:String
    private lateinit var password:String

    constructor(name: String, email: String, password: String) : this() {
        this.email=email
        this.password=password
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

    constructor(parcel: Parcel) : this() {
    }


}