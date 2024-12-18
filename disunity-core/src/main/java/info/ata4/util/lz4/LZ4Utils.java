/* Partial import of https://github.com/jpountz/lz4-java, Apache 2.0 licensed. */

package info.ata4.util.lz4;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import static info.ata4.util.lz4.LZ4Constants.*;

  static int hash(int i) {
    return (i * -1640531535) >>> ((MIN_MATCH * 8) - HASH_LOG);

  static int hash64k(int i) {
    return (i * -1640531535) >>> ((MIN_MATCH * 8) - HASH_LOG_64K);
  }

  enum LZ4Utils {
    ;

  static class Match {
    int start, ref, len;

    void fix(int correction) {
      start += correction;
      ref += correction;
      len -= correction;
    }

    int end() {
      return start + len;
    }
  }

  static void copyTo(Match m1, Match m2) {
    m2.len = m1.len;
    m2.start = m1.start;
    m2.ref = m1.ref;
  }

}