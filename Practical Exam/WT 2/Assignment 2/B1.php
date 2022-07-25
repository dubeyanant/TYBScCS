<html>

<body>
    <?php
    $xml = simplexml_load_file('book.xml');
    ?>
    <table border='5'>
        <tr>
            <th>bookno</th>
            <th>bookname</th>
            <th>authorname</th>
            <th>price</th>
            <th>year</th>
        </tr>

        <?php foreach ($xml->book as $a) : ?>
            <tr>
                <td><?php echo $a->bookno; ?></td>
                <td><?php echo $a->bookname; ?></td>
                <td><?php echo $a->authorname; ?></td>
                <td><?php echo $a->price; ?></td>
                <td><?php echo $a->year; ?></td>
            </tr>
        <?php endforeach; ?>
    </table>
</body>

</html>