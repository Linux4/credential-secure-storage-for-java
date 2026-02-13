// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

module org.aglais.credentialstorage {
    requires com.sun.jna;
    requires com.sun.jna.platform;
    requires org.slf4j;

    exports org.aglais.credentialstorage.model;
    exports org.aglais.credentialstorage;

    exports org.aglais.credentialstorage.implementation.posix.internal to com.sun.jna;
    exports org.aglais.credentialstorage.implementation.posix.keyring to com.sun.jna;
    exports org.aglais.credentialstorage.implementation.posix.libsecret to com.sun.jna;
    exports org.aglais.credentialstorage.implementation.windows to com.sun.jna;
}
