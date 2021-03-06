/*
 * Copyright 2020 Spikot project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

@file:Suppress("unused")

package kr.heartpattern.spikot.chat

import org.bukkit.ChatColor.*

fun black(builder: Builder): ChatBuilder = chat { black(builder) }
fun black(text: String): ChatBuilder = chat { black(text) }
fun ChatBuilder.black(builder: Builder) = color(BLACK, builder)
fun ChatBuilder.black(text: String) = color(BLACK, text)
fun darkBlue(builder: Builder): ChatBuilder = chat { darkBlue(builder) }
fun darkBlue(text: String): ChatBuilder = chat { darkBlue(text) }
fun ChatBuilder.darkBlue(builder: Builder) = color(DARK_BLUE, builder)
fun ChatBuilder.darkBlue(text: String) = color(DARK_BLUE, text)
fun darkGreen(builder: Builder): ChatBuilder = chat { darkGreen(builder) }
fun darkGreen(text: String): ChatBuilder = chat { darkGreen(text) }
fun ChatBuilder.darkGreen(builder: Builder) = color(DARK_GREEN, builder)
fun ChatBuilder.darkGreen(text: String) = color(DARK_GREEN, text)
fun darkAqua(builder: Builder): ChatBuilder = chat { darkAqua(builder) }
fun darkAqua(text: String): ChatBuilder = chat { darkAqua(text) }
fun ChatBuilder.darkAqua(builder: Builder) = color(DARK_AQUA, builder)
fun ChatBuilder.darkAqua(text: String) = color(DARK_AQUA, text)
fun darkRed(builder: Builder): ChatBuilder = chat { darkRed(builder) }
fun darkRed(text: String): ChatBuilder = chat { darkRed(text) }
fun ChatBuilder.darkRed(builder: Builder) = color(DARK_RED, builder)
fun ChatBuilder.darkRed(text: String) = color(DARK_RED, text)
fun darkPurple(builder: Builder): ChatBuilder = chat { darkPurple(builder) }
fun darkPurple(text: String): ChatBuilder = chat { darkPurple(text) }
fun ChatBuilder.darkPurple(builder: Builder) = color(DARK_PURPLE, builder)
fun ChatBuilder.darkPurple(text: String) = color(DARK_PURPLE, text)
fun gold(builder: Builder): ChatBuilder = chat { gold(builder) }
fun gold(text: String): ChatBuilder = chat { gold(text) }
fun ChatBuilder.gold(builder: Builder) = color(GOLD, builder)
fun ChatBuilder.gold(text: String) = color(GOLD, text)
fun gray(builder: Builder): ChatBuilder = chat { gray(builder) }
fun gray(text: String): ChatBuilder = chat { gray(text) }
fun ChatBuilder.gray(builder: Builder) = color(GRAY, builder)
fun ChatBuilder.gray(text: String) = color(GRAY, text)
fun darkGray(builder: Builder): ChatBuilder = chat { darkGray(builder) }
fun darkGray(text: String): ChatBuilder = chat { darkGray(text) }
fun ChatBuilder.darkGray(builder: Builder) = color(DARK_GRAY, builder)
fun ChatBuilder.darkGray(text: String) = color(DARK_GRAY, text)
fun blue(builder: Builder): ChatBuilder = chat { blue(builder) }
fun blue(text: String): ChatBuilder = chat { blue(text) }
fun ChatBuilder.blue(builder: Builder) = color(BLUE, builder)
fun ChatBuilder.blue(text: String) = color(BLUE, text)
fun green(builder: Builder): ChatBuilder = chat { green(builder) }
fun green(text: String): ChatBuilder = chat { green(text) }
fun ChatBuilder.green(builder: Builder) = color(GREEN, builder)
fun ChatBuilder.green(text: String) = color(GREEN, text)
fun aqua(builder: Builder): ChatBuilder = chat { aqua(builder) }
fun aqua(text: String): ChatBuilder = chat { aqua(text) }
fun ChatBuilder.aqua(builder: Builder) = color(AQUA, builder)
fun ChatBuilder.aqua(text: String) = color(AQUA, text)
fun red(builder: Builder): ChatBuilder = chat { red(builder) }
fun red(text: String): ChatBuilder = chat { red(text) }
fun ChatBuilder.red(builder: Builder) = color(RED, builder)
fun ChatBuilder.red(text: String) = color(RED, text)
fun lightPurple(builder: Builder): ChatBuilder = chat { lightPurple(builder) }
fun lightPurple(text: String): ChatBuilder = chat { lightPurple(text) }
fun ChatBuilder.lightPurple(builder: Builder) = color(LIGHT_PURPLE, builder)
fun ChatBuilder.lightPurple(text: String) = color(LIGHT_PURPLE, text)
fun yellow(builder: Builder): ChatBuilder = chat { yellow(builder) }
fun yellow(text: String): ChatBuilder = chat { yellow(text) }
fun ChatBuilder.yellow(builder: Builder) = color(YELLOW, builder)
fun ChatBuilder.yellow(text: String) = color(YELLOW, text)
fun white(builder: Builder): ChatBuilder = chat { white(builder) }
fun white(text: String): ChatBuilder = chat { white(text) }
fun ChatBuilder.white(builder: Builder) = color(WHITE, builder)
fun ChatBuilder.white(text: String) = color(WHITE, text)