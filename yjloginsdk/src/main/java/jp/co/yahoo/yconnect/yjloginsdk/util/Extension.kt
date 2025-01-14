/*
 * © 2023 LY Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.yahoo.yconnect.yjloginsdk.util

import android.util.Base64
import java.security.SecureRandom

internal fun generateRandomByteArray(length: Int): ByteArray {
    val randomByte = ByteArray(length)
    SecureRandom().nextBytes(randomByte)
    return randomByte
}

internal fun ByteArray.base64UrlSafe(): String {
    return Base64.encodeToString(
        this,
        Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP
    )
}
