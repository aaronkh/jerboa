package com.jerboa.datatypes.types

import android.os.Parcelable
import androidx.compose.runtime.Immutable
import kotlinx.parcelize.Parcelize

@Immutable
@Parcelize
data class CreateCommunity(
    val name: String,
    val title: String,
    val description: String? = null,
    val icon: String? = null,
    val banner: String? = null,
    val nsfw: Boolean? = null,
    val posting_restricted_to_mods: Boolean? = null,
    val discussion_languages: List<LanguageId>? = null,
    val auth: String,
) : Parcelable
