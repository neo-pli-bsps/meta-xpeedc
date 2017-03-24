KV = "4.1.21"
SRCDATE = "20170318"
GCC = "6.2.0"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlx.info/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "6d9ac4b3fcc984c674b82962e92a0034"
SRC_URI[sha256sum] = "fbcabefdfdcbd5482984c10887217f5bef5a9b7d099fec6febea3b2c18b405d0"

COMPATIBLE_MACHINE = "xpeedc"
