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

package kr.heartpattern.spikot.misc

/**
 * List that convert type lazily
 * @param B Back type
 * @param F Front type
 * @param backingList Back list with back type
 * @param converter Converter that convert between back and front type
 */
open class MutableConvertingList<B, F>(
    override val backingList: MutableList<B>,
    converter: Converter<B, F>
) : ConvertingList<B, F>(backingList, converter), MutableList<F> {

    override fun iterator(): MutableIterator<F> {
        val iterator = backingList.iterator()
        return object : MutableIterator<F> {
            override fun hasNext(): Boolean {
                return iterator.hasNext()
            }

            override fun next(): F {
                return read(iterator.next())
            }

            override fun remove() {
                iterator.remove()
            }
        }
    }

    override fun add(element: F): Boolean {
        return backingList.add(write(element))
    }

    override fun add(index: Int, element: F) {
        return backingList.add(index, write(element))
    }

    override fun addAll(index: Int, elements: Collection<F>): Boolean {
        return backingList.addAll(index, elements.map(::write))
    }

    override fun addAll(elements: Collection<F>): Boolean {
        return backingList.addAll(elements.map(::write))
    }

    override fun clear() {
        return backingList.clear()
    }

    override fun listIterator(): MutableListIterator<F> {
        val iterator = backingList.listIterator()
        return object : MutableListIterator<F> {
            override fun hasPrevious(): Boolean {
                return iterator.hasPrevious()
            }

            override fun nextIndex(): Int {
                return iterator.nextIndex()
            }

            override fun previous(): F {
                return read(iterator.previous())
            }

            override fun previousIndex(): Int {
                return iterator.previousIndex()
            }

            override fun add(element: F) {
                iterator.add(write(element))
            }

            override fun hasNext(): Boolean {
                return iterator.hasNext()
            }

            override fun next(): F {
                return read(iterator.next())
            }

            override fun remove() {
                iterator.remove()
            }

            override fun set(element: F) {
                iterator.set(write(element))
            }
        }
    }

    override fun listIterator(index: Int): MutableListIterator<F> {
        val iterator = backingList.listIterator(index)
        return object : MutableListIterator<F> {
            override fun hasPrevious(): Boolean {
                return iterator.hasPrevious()
            }

            override fun nextIndex(): Int {
                return iterator.nextIndex()
            }

            override fun previous(): F {
                return read(iterator.previous())
            }

            override fun previousIndex(): Int {
                return previousIndex()
            }

            override fun add(element: F) {
                iterator.add(write(element))
            }

            override fun hasNext(): Boolean {
                return iterator.hasNext()
            }

            override fun next(): F {
                return read(iterator.next())
            }

            override fun remove() {
                iterator.remove()
            }

            override fun set(element: F) {
                iterator.set(write(element))
            }
        }
    }

    override fun remove(element: F): Boolean {
        return backingList.remove(write(element))
    }

    override fun removeAll(elements: Collection<F>): Boolean {
        return backingList.removeAll(elements.map(::write))
    }

    override fun removeAt(index: Int): F {
        return read(backingList.removeAt(index))
    }

    override fun retainAll(elements: Collection<F>): Boolean {
        return backingList.retainAll(elements.map(::write))
    }

    override fun set(index: Int, element: F): F {
        return read(backingList.set(index, write(element)))
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<F> {
        return MutableConvertingList(backingList.subList(fromIndex, toIndex), converter)
    }
}