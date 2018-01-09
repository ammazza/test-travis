if [ "$INGEST_VERSION" = "0.1.0-SNAPSHOT" ]; then
    echo "It's a snapshot. I'll deploy it!"
else
    echo "It's a release. You need a tag to deploy."
fi
