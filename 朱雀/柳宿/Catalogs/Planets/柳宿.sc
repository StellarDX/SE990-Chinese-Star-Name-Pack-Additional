// 柳宿增二(a2**)
Remove "KAP Cnc A"{ParentBody "KAP Cnc"}
Remove "KAP Cnc B"{ParentBody "KAP Cnc"}
Star "HD 78316 A"
{
	ParentBody "HD 78316"
	Class      "B8IIIp"
	MassSol    4.5
  RadSol     5
  Luminosity 322
  Teff       12800
  FeH        0.51

	Orbit
	{
		PeriodDays      6.3933
		Eccentricity    0.13
    Epoch           2440001.95
		ArgOfPericenter 337
		MeanAnomaly     0
    //SemiAmplitude   67.4
	}
}

Star "HD 78316 B" //spectroscopic companion
{
	ParentBody "HD 78316"
	Class      ""
	MassSol    2.1
  RadSol     2.4
  Teff       8500

	Orbit
	{
    PeriodDays      6.3933
		Eccentricity    0.13
    Epoch           2440001.95
		ArgOfPericenter 157
		MeanAnomaly     0
	}
}

// 柳宿增三(PM**)
Remove "Acubens (AB)"{ParentBody "Acubens"}
Remove "ALF Cnc B"{ParentBody "Acubens"}
Remove "Acubens Aa"{ParentBody "Acubens (AB)"}
Remove "ALF Cnc Ab"{ParentBody "Acubens (AB)"}
Barycenter "HD 76756 A"
{
	ParentBody "HD 76756"
	BinaryOrbit
	{
    Epoch           2391644.81279802
    Separation      616.98
    PositionAngle   325
	}
}

Star "HD 76756 Aa"
{
	ParentBody "HD 76756 A"
	Class      "kA7VmF0/2III/IVSr"
	MassSol    2.1
  Luminosity 50.55
  Teff       7943
  FeH        3.73

	BinaryOrbit
	{
    Separation      5.46117
	}
}

Star "HD 76756 Ab"
{
	ParentBody "HD 76756 A"
	Class      "Am?"

  /* BinaryOrbit
	{
    Separation      5.46117
	} */
}

Star "HD 76756 B"
{
	ParentBody "HD 76756"
	Class      ""
  MassSol    0.38

  /* BinaryOrbit
	{
    Epoch           2391644.81279802
    Separation      616.98
    PositionAngle   325
	} */
}

// 柳宿增十(PM**Pl)
Remove "Altarf A"{ParentBody "Altarf"}
Remove "Altarf B"{ParentBody "Altarf"}
Star "HD 69267 A"
{
	ParentBody "HD 69267"
	Class      "K4 III"
	RadSol     61
  Luminosity 871
	Teff       3990
	FeH        -0.24

	BinaryOrbit
	{
		Period          76000
		Separation      2600
	}
}

Star "HD 69267 B"
{
	ParentBody "HD 69267"
	Class      "M"

  /* BinaryOrbit
	{
		Period          76000
		Separation      2600
	} */
}

//////////ExoPlanets//////////
Remove "BET Cnc A b"{ParentBody "BET Cnc A"}
Planet	"BET Cnc b"
{
	ParentBody     "HD 69267 A"
	DiscMethod     "RadVel"
	DiscDate       "2014"
  Mass           2479.061364

	Orbit
	{
		SemiMajorAxis   1.7
    PeriodDays      605.2
		Eccentricity    0.08
	}
}

// 酒旗增五(**)
Star	"HD 81873 A"
{
	ParentBody     "HD 81873"
	Class          "K0III"

	BinaryOrbit
	{
		Separation      3533.6
	}
}

Star	"HD 81873 B"
{
	ParentBody     "HD 81873"
	Class          "A3.8 V"

	/* BinaryOrbit
	{
		Separation      3533.6
	} */
}
