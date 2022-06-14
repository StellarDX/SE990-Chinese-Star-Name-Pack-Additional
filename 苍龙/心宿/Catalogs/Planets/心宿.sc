// 心宿增一(***)
Barycenter "HD 145483 AB"
{
	ParentBody "HD 145483"
	BinaryOrbit
	{
		Separation      357.12
	}
}

Star "HD 145483 A"
{
	ParentBody "HD 145483 AB"
	Class      "B9V"
	MassSol    2.939
  Luminosity 91
  Teff       11402
  Age        0.15

  BinaryOrbit
	{
		Separation      18.5996
	}
}

Star "HD 145483 B"
{
	ParentBody "HD 145483 AB"
	Class      "K7.9XR"

  /* BinaryOrbit
	{
		Separation      18.5996
	} */
}

Star "HD 145483 C"
{
	ParentBody "HD 145483"
	Class      "F3V"

  /*BinaryOrbit
	{
		Separation      357.12
	}*/
}

// 心宿增二(SB**)
Star "HD 145482 A"
{
	ParentBody "HD 145482"
	Class      "B2V"
	MassSol    7.8
  Luminosity 3020
  Teff       24000
  Age        0.011

  Orbit
	{
    PeriodDays      5.7805
    Eccentricity    0.19
    Epoch           2443298.4
    ArgOfPericenter 295
    MeanAnomaly     0
    //SemiAmplitude   31.5
	}
}

Star "HD 145482 B"
{
	ParentBody "HD 145482"
	Class      ""
  MassSol    1.12

  Orbit
	{
    PeriodDays      5.7805
    Eccentricity    0.19
    Epoch           2443298.4
    ArgOfPericenter 115
    MeanAnomaly     0
	}
}

// 心宿增四(*****)
Remove "RHO Oph A"{ParentBody "RHO Oph"}
Remove "RHO Oph B"{ParentBody "RHO Oph"}
Barycenter "心宿增四/心宿增九/RHO Oph AB/CD-23 12861/HIP 80473"
{
	ParentBody "RHO Oph"
	Orbit
  {
    RefPlane        "Static"
  }
}

Star "RHO Oph A/HD 147933/HR 6112/SAO 184382"
{
	ParentBody "RHO Oph AB"
	Class      "B2V"
	MassSol    9.6
  RadSol     8.5
  Luminosity 13000
  Teff       21900
  RotationPeriod 28.92

  Orbit
	{
    Period          2398
    Eccentricity    0.675
    Inclination     135.3
    AscendingNode   77.5
    Epoch           2570978.73239949
    ArgOfPericenter 46.1
    MeanAnomaly     0
	}
}

Star "RHO Oph B/HD 147934/HR 6113/SAO 184381"
{
	ParentBody "RHO Oph AB"
	Class      "B2V"
  MassSol    8

  Orbit
	{
    Period          2398
    Eccentricity    0.675
    Inclination     135.3
    AscendingNode   77.5
    Epoch           2570978.73239949
    ArgOfPericenter 226.1
    MeanAnomaly     0
	}
}

Star "RHO Oph C/HD 147932/CD-23 12862/HIP 80474/SAO 184383"
{
	ParentBody "RHO Oph"
	Class      ""
  MassSol    5

  Orbit
	{
    SemiMajorAxis   17000
    ArgOfPericenter 353.3
    MeanAnomaly     0
	}
}

Barycenter "RHO Oph DE/HD 147888/BU 1115/HIP 80461/SAO 184377/WDS J16256-2327"
{
	ParentBody "RHO Oph"
  Orbit
	{
    SemiMajorAxis   19000
    ArgOfPericenter 254.5
    MeanAnomaly     0
	}
}

Star "RHO Oph D"
{
	ParentBody "RHO Oph DE"
	Class      ""
	MassSol    3.06

  Orbit
	{
    Period          675.5
    Eccentricity    0.707
    Inclination     134.8
    AscendingNode   152.7
    Epoch           2454685.61630762
    ArgOfPericenter 80.4
    MeanAnomaly     0
	}
}

Star "RHO Oph E"
{
	ParentBody "RHO Oph DE"
	Class      ""
  MassSol    1.97

  Orbit
	{
    Period          675.5
    Eccentricity    0.707
    Inclination     134.8
    AscendingNode   152.7
    Epoch           2454685.61630762
    ArgOfPericenter 260.4
    MeanAnomaly     0
	}
}
