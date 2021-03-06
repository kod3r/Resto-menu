package be.ugent.zeus.resto.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/**
 *
 * @author Thomas Meire
 */
public class Heracles extends Activity {

  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    setContentView(R.layout.heracles);

    findViewById(R.id.home_btn_locations).setOnClickListener(
            new View.OnClickListener() {

              public void onClick(View view) {
                startActivity(new Intent(Heracles.this, BuildingMap.class));
              }
            });

    findViewById(R.id.home_btn_menu).setOnClickListener(
            new View.OnClickListener() {

              public void onClick(View view) {
                startActivity(new Intent(Heracles.this, RestoMenu.class));
              }
            });
    findViewById(R.id.home_btn_schamper).setOnClickListener(
            new View.OnClickListener() {

              public void onClick(View view) {
                startActivity(new Intent(Heracles.this, SchamperDaily.class));
              }
            });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.heracles, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle item selection
    switch (item.getItemId()) {
      case R.id.settings:
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }
}
