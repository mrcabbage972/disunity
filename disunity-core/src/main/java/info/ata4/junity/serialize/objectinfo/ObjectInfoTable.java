/*
 ** 2015 November 23
 **
 ** The author disclaims copyright to this source code. In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.junity.serialize.objectinfo;

import info.ata4.junity.UnityStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
        super(elementFactory);
    }

    public Map<Long, T> infoMap() {
        return infoMap;
    }

    public void infoMap(Map<Long, T> infoMap) {
        this.infoMap = Objects.requireNonNull(infoMap);
    }
}