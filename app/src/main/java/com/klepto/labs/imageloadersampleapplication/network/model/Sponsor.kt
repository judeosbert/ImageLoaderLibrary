package com.klepto.labs.imageloadersampleapplication.network.model


import com.google.gson.annotations.SerializedName
import com.klepto.labs.imageloadersampleapplication.network.model.LinksXX
import com.klepto.labs.imageloadersampleapplication.network.model.ProfileImageX

data class Sponsor(
    @SerializedName("accepted_tos")
    val acceptedTos: Boolean?,
    @SerializedName("bio")
    val bio: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("instagram_username")
    val instagramUsername: String?,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("links")
    val links: LinksXX?,
    @SerializedName("location")
    val location: Any?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("portfolio_url")
    val portfolioUrl: String?,
    @SerializedName("profile_image")
    val profileImage: ProfileImageX?,
    @SerializedName("total_collections")
    val totalCollections: Int?,
    @SerializedName("total_likes")
    val totalLikes: Int?,
    @SerializedName("total_photos")
    val totalPhotos: Int?,
    @SerializedName("twitter_username")
    val twitterUsername: String?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("username")
    val username: String?
)