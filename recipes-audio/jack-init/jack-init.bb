SUMMARY = "JACK init script"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI += " \
    file://.jackdrc \
    file://COPYING.MIT \
"

do_install(){
    install -d ${D}/home/root
    cp -r ${WORKDIR}/.jackdrc ${D}/home/root/.jackdrc
}

FILES_${PN} += "/home/root"





