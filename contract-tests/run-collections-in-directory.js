const newman = require('newman'),
      fs = require('fs');

fs.readdir('./contract-tests', function (err, files) {
    if (err) { throw err; }

    files = files.filter(function (file) {
        return (/^((?!(package(-lock)?))|.+)\.postman_collection.json/).test(file);
    });

    console.log(files);

    // now we iterate on each file name and call newman.run using each file name
    files.forEach(function (file) {
        newman.run({
            collection: require(`${__dirname}/${file}`),
            environment: require('contract-tests/Customers Service Github Docker.postman_environment.json')
        }).on('start', function (err, args) { // on start of run, log to console
            console.log(`Running a collection ${file}`);
        }).on('done', function (err, summary) {
            if (err || summary.error) {
                console.error('Collection run encountered an error.');
            }
            else {
                console.log('Collection run completed.');
            }
        });
    });
});