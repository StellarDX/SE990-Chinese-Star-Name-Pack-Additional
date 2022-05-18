// 奎宿增一(dS***)
// C的位置不知道
Star "HD 2628 B"
{
	ParentBody "HD 2628"
	Class      ""
	MassSol    0.71

	Orbit
	{
    SemiMajorAxis   128.31
	}
}

Star "HD 2628 C"
{
	ParentBody "HD 2628"
	Class      ""
	MassSol    0.14

	Orbit
	{
    SemiMajorAxis   230 // ?
	}
}

// 奎宿增二(**)
Star "HD 3690 A"
{
	ParentBody "HD 3690"
	Class      "K2IIIa"
  Luminosity 165.56
  Teff       4664
  FeH        -0.09

	BinaryOrbit
	{
    Separation      841.137
	}
}

Star "HD 3690 B"
{
	ParentBody "HD 3690"
	Class      "F3V"

  /*BinaryOrbit
	{
    Separation      841.137
	}*/
}

// 奎宿增三(PM**Pl)
Remove "54 Psc A"{ParentBody "54 Psc"}
Remove "54 Psc B"{ParentBody "54 Psc"}
Star "HD 3651 A"
{
	ParentBody "HD 3651"
	Class      "K0V"
  MassSol    0.76
	RadSol     0.944
	Luminosity 0.52
	Teff       5062
	FeH        -0.15
  RotationPeriod 964.8
	Age        6.4

	Orbit
	{
    RefPlane        "Static"
	}
}

Star "HD 3651 B"
{
	ParentBody "HD 3651"
	Class      "T7.5V"
	MassSol    0.051
  RadSol     0.082
  Teff       810

	Orbit
	{
    SemiMajorAxis   476
	}
}

//////////ExoPlanets//////////
Remove "54 Psc A b"{ParentBody "54 Psc A"}
Planet	"54 Psc Ab/HD 3651 b"
{
	ParentBody     "HD 3651 A"
	DiscMethod     "RadVel" // Doppler spectroscopy
	DiscDate       "2003" // Fischer et al./Lick Observatory and Keck Observatory/2003
  Mass           72.46487064

  Rings{}

	Orbit
	{
		SemiMajorAxis   0.295
		Eccentricity    0.645
    PeriodDays      62.25
		Inclination     83
    Epoch           2453932.6
		ArgOfPericen    243
    MeanAnomaly     0
	}
}

// 奎宿增五(**)
// B和C不知道是光学伴星还是物理伴星，如果是物理伴星，那么半长轴就是1800AU，周期就是5万年
Remove "64 Psc A"{ParentBody "64 Psc"}
Remove "64 Psc B"{ParentBody "64 Psc"}
Star "HD 4676 A"
{
	ParentBody "HD 4676"
	Class      "F8V"
	MassSol    1.223
  RadSol     1.25
  Luminosity 2.12
  Teff       6250
  FeH        0
  Age        6.81

	Orbit
	{
		PeriodDays      13.8244906
		Eccentricity    0.23657
		Inclination     73.92
		AscendingNode   207.41
    Epoch           2450906.484
		ArgOfPericenter 23.057
		MeanAnomaly     0
    //SemiAmplitude   57.552
	}
}

Star "HD 4676 B"
{
	ParentBody "HD 4676"
	Class      "F8V"
	MassSol    1.17
  RadSol     1.18
  Luminosity 1.85
  Teff       6200

	Orbit
	{
    PeriodDays      13.8244906
		Eccentricity    0.23657
		Inclination     73.92
		AscendingNode   207.41
    Epoch           2450906.484
		ArgOfPericenter 203.057
		MeanAnomaly     0
    //SemiAmplitude   59.557
	}
}

// 奎宿增六(**)
Star "HD 5267 A"
{
	ParentBody "HD 5267"
	Class      "A0V"

	BinaryOrbit
	{
    Separation      54.2401
	}
}

Star "HD 5267 B"
{
	ParentBody "HD 5267"
	Class      "A4V"

  /*BinaryOrbit
	{
    Separation      54.2401
	}*/
}

// 奎宿增八(**)
Remove "PSI2 Psc A"{ParentBody "PSI2 Psc"}
Remove "PSI2 Psc B"{ParentBody "PSI2 Psc"}
Star "HD 6695 A"
{
	ParentBody "HD 6695"
	Class      "A3V"
  MassSol    1.82
  RadSol     2
  Luminosity 13
  Teff       8611
  Age        0.25

	BinaryOrbit
	{
    Epoch           2454466.47098835
    Separation      16.88
    PositionAngle   174.99
	}
}

Star "HD 6695 B"
{
	ParentBody "HD 6695"
	Class      "G-K"

  /*BinaryOrbit
	{
    Epoch           2454466.47098835
    Separation      16.88
    PositionAngle   174.99
	}*/
}

// 奎宿增九(**)
Star "HD 5286 A"
{
	ParentBody "HD 5286"
	Class      "G8IV"
  Luminosity 11.57

	Orbit
	{
		PeriodDays      61183
		Eccentricity    0.30603
		Inclination     44.57
		AscendingNode   173.66
    Epoch           2435543.5
		ArgOfPericenter 178.62
		MeanAnomaly     0
	}
}

Star "HD 5286 B"
{
	ParentBody "HD 5286"
	Class      "K3IV"

	Orbit
	{
    PeriodDays      61183
		Eccentricity    0.30603
		Inclination     44.57
		AscendingNode   173.66
    Epoch           2435543.5
		ArgOfPericenter 358.62
		MeanAnomaly     0
	}
}

// 奎宿增十三(**)
Star	"HD 7034 A"
{
	ParentBody     "HD 7034"
	Class          "F0V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7.84646045
		Eccentricity    0.153162912
		Inclination     -0.752750635
		AscendingNode   0
		ArgOfPericenter -116.064712
		MeanAnomaly     42.8488602
	}
}

Star	"HD 7034 B"
{
	ParentBody     "HD 7034"
	Class          "B6.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7.84646045
		Eccentricity    0.153162912
		Inclination     -0.752750635
		AscendingNode   0
		ArgOfPericenter 63.9352883
		MeanAnomaly     42.8488602
	}
}

// 奎宿增十五(SB**)
Star	"HD 6118 A"
{
	ParentBody     "HD 6118"
	Class          "B9.5V"
  MassSol        2.65

	Orbit
	{
		PeriodDays      81.12625
		Eccentricity    0.8956
		Inclination     143.4
		AscendingNode   167.8
    Epoch           2431308.653
		ArgOfPericenter 166.6
		MeanAnomaly     0
    //SemiAmplitude   53.2
	}
}

Star	"HD 6118 B"
{
	ParentBody     "HD 6118"
	Class          "B9.5V"
  MassSol        2.36

	Orbit
	{
    PeriodDays      81.12625
		Eccentricity    0.8956
		Inclination     143.4
		AscendingNode   167.8
    Epoch           2431308.653
		ArgOfPericenter 346.6
		MeanAnomaly     0
    //SemiAmplitude   59.6
	}
}

// 奎宿增十七(SB**)
Star	"HD 8374 A"
{
	ParentBody     "HD 8374"
	Class          "A1m" // kA1hF1mF2
  MassSol        1.65
  RadSol         1.9
  Luminosity     9
  Age            0.71

	Orbit
	{
		PeriodDays      35.36815
		Eccentricity    0.64781
		Inclination     38
    Epoch           2454293.2187
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   39.216
	}
}

Star	"HD 8374 B"
{
	ParentBody     "HD 8374"
	Class          "Am"
  RadSol         1.8
  Luminosity     8.6

	Orbit
	{
    PeriodDays      35.36815
		Eccentricity    0.64781
		Inclination     38
    Epoch           2454293.2187
		ArgOfPericenter 180
		MeanAnomaly     0
    //SemiAmplitude   40.47
	}
}

// 外屏增一(SB**)
Star	"HD 6397 A"
{
	ParentBody     "HD 6397"
	Class          "F4V((Sr))"
	RadSol         2.8
	Luminosity     13.93
	Teff           6728

	Orbit
	{
		RefPlane        "Equator"
		Period          0.121403486
		Eccentricity    0.07625819
		Inclination     1.73536861
		AscendingNode   0
		ArgOfPericenter 138.408919
		MeanAnomaly     -122.381909
	}
}

Star	"HD 6397 B"
{
	ParentBody     "HD 6397"
	Class          "G5.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.121403486
		Eccentricity    0.07625819
		Inclination     1.73536861
		AscendingNode   0
		ArgOfPericenter 318.408919
		MeanAnomaly     -122.381909
	}
}

// 外屏增五(***)
Star	"77 Psc A"
{
	ParentBody     "77 Psc"
	Class          "F5V"
	RadSol         1.3
	Luminosity     3.97
	Teff           7218
	FeH            -0.16

	/*BinaryOrbit
	{
		Separation      1347.7
	}*/
}

Barycenter	"外屏增五/77 Psc B"
{
	ParentBody     "77 Psc"
	BinaryOrbit
	{
		Separation      1347.7
	}
}

Star	"TYC 22-1354-1"
{
	ParentBody     "77 Psc B"
	Class          "F5V"

	BinaryOrbit
	{
		Separation      43.8804
	}
}

Star	"TYC 22-1354-2"
{
	ParentBody     "77 Psc B"
	Class          "F7V"

	BinaryOrbit
	{
		Separation      43.8804
	}
}

// 天溷增二(RS***)
Remove "13 Cet A"{ParentBody "13 Cet"}
Remove "13 Cet B"{ParentBody "13 Cet"}
Remove "13 Cet Aa"{ParentBody "13 Cet A"}
Remove "13 Cet Ab"{ParentBody "13 Cet A"}
Barycenter "HD 3196 A"
{
	ParentBody "HD 3196"
	BinaryOrbit
	{
		PeriodDays      2516.6163
		Eccentricity    0.773
		Inclination     49.4
		AscendingNode   149
		Epoch           2456935.7034
		ArgOfPericenter 103.8
		MeanAnomaly     0
	}
}

Star "HD 3196 Aa"
{
	ParentBody "HD 3196 A"
	Class      "F6V"
	MassSol    1.18
	Luminosity 2.63
	Teff       6457
	Age        3.8

	Orbit
	{
		PeriodDays      2.081891
		Eccentricity    0
		Epoch           2443400.4573
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   43.98
	}
}

Star "HD 3196 Ab"
{
	ParentBody "HD 3196 A"
	Class      "K3.5V"

	Orbit
	{
		PeriodDays      2.081891
		Eccentricity    0
		Epoch           2443400.4573
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 3196 B"
{
	ParentBody "HD 3196"
	Class      "G4V"
	MassSol    0.9
	Luminosity 0.83
	Teff       5754
	Age        2.5

	/*BinaryOrbit
	{
		PeriodDays      2516.6163
		Eccentricity    0.773
		Inclination     49.4
		AscendingNode   149
		Epoch           2456935.7034
		ArgOfPericenter 283.8
		MeanAnomaly     0
	}*/
}

// 阁道增一(SB**)
Star	"HD 4058 A"
{
	ParentBody     "HD 4058"
	Class          "A5V"
  MassSol        1.76
	RadSol         1.5
	Luminosity     22
	Teff           8392
	Age            0.251

	Orbit
	{
		PeriodDays      1.9642
		Eccentricity    0
    Epoch           2427535.74
		ArgOfPericenter 180
		MeanAnomaly     0
    //SemiAmplitude   120.5
	}
}

Star	"HD 4058 B"
{
	ParentBody     "HD 4058"
	Class          "F1.8 V"

	Orbit
	{
		PeriodDays      1.9642
		Eccentricity    0
    Epoch           2427535.74
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   122.1
	}
}

// 阁道增二(SB**)
Star	"HD 3901 A"
{
	ParentBody     "HD 3901"
	Class          "B2.5V"
  MassSol        10.1
	RadSol         4.5
	Luminosity     2873
	Teff           15585
	Age            0.019

	Orbit
	{
		PeriodDays      940.2
		Eccentricity    0.4
    Epoch           2441738
		ArgOfPericenter 299
		MeanAnomaly     0
    //SemiAmplitude   11.9
	}
}

Star	"HD 3901 B"
{
	ParentBody     "HD 3901"
	Class          "B2.9 V"

	Orbit
	{
		PeriodDays      940.2
		Eccentricity    0.4
    Epoch           2441738
		ArgOfPericenter 119
		MeanAnomaly     0
	}
}

// 阁道增三(YSG*****+?)
Star	"阁道增三/PHI1 Cas/34 Cas A/HD 7927/HIP 6242/BD+57 260/SAO 22191/GC 1594"
{
	ParentBody     "CCDM J01200+5813"
	Class          "F0Ia"
  MassSol        6.3
	RadSol         263
	Oblateness     0
	Luminosity     170000
	Teff           7341
	FeH            -0.24
	Age            0.02

	Orbit
	{
		RefPlane        "Static"
	}
}
/*
Star	"NGC 457 135/CCDM J01200+5813B"
{
	ParentBody     "CCDM J01200+5813"
	Class          "B-A" // guess

	Orbit
	{
		SemiMajorAxis   196000
		ArgOfPericenter 205
		MeanAnomaly     0
	}
}

Barycenter	"PHI2 Cas/CCDM J01200+5813C/HD 7902/HIP 6229/BD+57 257/SAO 22187/GC 1590/NSV 466"
{
	ParentBody     "CCDM J01200+5813"
	Orbit
	{
		SemiMajorAxis   536360
		ArgOfPericenter 230.5
		MeanAnomaly     0
	}
}
Star	"HD 7902 A"
{
	ParentBody     "HD 7902"
	Class          "B6Ib"
	MassSol        21
	RadSol         53
	Luminosity     83000
	Teff           15500

	Orbit
	{
		RefPlane        "Equator"
		Period          176.520738
		Eccentricity    0.734816492
		Inclination     -1.59381199
		AscendingNode   0
		ArgOfPericenter 75.338452
		MeanAnomaly     91.8921556
	}
}

Star	"HD 7902 B"
{
	ParentBody     "HD 7902"
	Class          "B7.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          176.520738
		Eccentricity    0.734816492
		Inclination     -1.59381199
		AscendingNode   0
		ArgOfPericenter 255.338452
		MeanAnomaly     91.8921556
	}
}

Star	"BD+57 254/CCDM J01200+5813D"
{
	ParentBody     "CCDM J01200+5813"
	Class          "B3"

	Orbit
	{
		SemiMajorAxis   715640
		ArgOfPericenter 280
		MeanAnomaly     0
	}
}

Star	"NGC 457 100/CCDM J01200+5813E"
{
	ParentBody     "CCDM J01200+5813"
	Class          "B-A" // guess

	Orbit
	{
		SemiMajorAxis   681880
		ArgOfPericenter 235.5
		MeanAnomaly     0
	}
}
*/

// 王良增十二(SB**)
Star	"HD 2054 A"
{
	ParentBody     "HD 2054"
	Class          "B9IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          74.8105521
		Eccentricity    0.825410008
		Inclination     0.0332481861
		AscendingNode   0
		ArgOfPericenter -11.0813478
		MeanAnomaly     146.08205
	}
}

Star	"HD 2054 B"
{
	ParentBody     "HD 2054"
	Class          "F0.7 IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          74.8105521
		Eccentricity    0.825410008
		Inclination     0.0332481861
		AscendingNode   0
		ArgOfPericenter 168.918652
		MeanAnomaly     146.08205
	}
}
