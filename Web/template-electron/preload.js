window.addEventListener('DOMContentLoaded', () => {
    const versionTypeList = ['node', 'chrome', 'electron'];
    for (let i = 0; i < versionTypeList.length; i++) {
        const versionType = versionTypeList[i];
        const versionTypeSpan = document.querySelector(`#${versionType}`);
        versionTypeSpan.innerHTML = process.versions[versionType];
    }
});