
// KAT-BEGIN show docs on install or upgrade from 1.0
chrome.runtime.onInstalled.addListener(function(details) {
    if (details.reason === 'install') {
        chrome.tabs.create({'url': 'https://www.katalon.com/automation-recorder'});
    } else if (details.reason === 'update') {
        var previousVersion = details.previousVersion;
        var previousMajorVersion = previousVersion.substring(0, previousVersion.indexOf('.'));
        if (previousMajorVersion === '1') {
            chrome.tabs.create({'url': 'https://www.katalon.com/automation-recorder'});
        }
    }
});

chrome.runtime.setUninstallURL('https://www.surveymonkey.com/r/katalon-recorder');
// KAT-END

// KAT-BEGIN save last window size
function getWindowSize(callback) {
    chrome.storage.local.get('window', function(result) {
        var height = 730;
        var width = 750;
        if (result) {
            try {
                result = result.window;
                if (result.height) {
                    height = result.height;
                }
                if (result.width) {
                    width = result.width;
                }
            } catch (e) {
            }
        }
        callback(height, width);
    });
}
// KAT-END

browser.runtime.onMessage.addListener(function(request, sender, sendResponse, type) {
    if (request.captureEntirePageScreenshot) {
        browser.tabs.captureVisibleTab(request.windowId, { format: 'png' }).then(function(image) {
            sendResponse({
                image: image
            });
        });
        return true;
    }
});