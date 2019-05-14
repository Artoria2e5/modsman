module modsman.core {
    requires kotlin.stdlib;
    requires kotlin.stdlib.jdk8;
    requires kotlinx.coroutines.core;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires retrofit2.kotlin.coroutines.adapter;
    requires gson;
    requires okhttp3;
    requires murmur;

    opens modsman;
    exports modsman;
}