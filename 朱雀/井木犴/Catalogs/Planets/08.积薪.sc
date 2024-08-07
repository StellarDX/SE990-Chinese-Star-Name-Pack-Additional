// Object * 82 Gem  ---  Double or Multiple Star  ---  OID=@1004186   (@@20974,14)  ---  coobox=5543 
// Object types: Double or Multiple Star,Chemically Peculiar Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Optical Source,UV-emission Source 
// http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=6378
Barycenter "82 Gem AB"
{
	ParentBody      "82 Gem"
	BinaryOrbit     
	{
		Period          16177
		Separation      1036.23191499557 // 4.29 asec
	}
}

Star "82 Gem A"
{
	DateUpdated     "2024-07-17"
	ParentBody      "82 Gem AB"
	Class           "K0III"
	AbsMagn         -0.7
	MassSol         4.27

	BinaryOrbit // VB6_USN2002 WRH_15AB Gr.4
	{
		Period          580
		Separation      109.18065488777 // 0.452 asec
		Eccentricity    0.449
		Inclination     117.2
		AscendingNode   55.4
		Epoch           2434743.392254174221307
		ArgOfPericenter 321.7
		MeanAnomaly     0
	}
}

Star "82 Gem B"
{
	DateUpdated     "2024-07-17"
	ParentBody      "82 Gem AB"
	Class           "A0IV:"
	MassSol         3.47
}

// Object * 82 Gem C  ---  Star  ---  OID=@1004160   (@@20973,7)  ---  coobox=5543 
// Object types: Double or Multiple Star,Star 
Star "82 Gem C/Gaia DR3 675332278142384512/Gaia DR2 675332278142384512/ADS 6378 C/BD+23 1812C/CCDM J07486+2309C/CSI+23 1812 3/WDS J07486+2308C/** BU 1062C/PMSC 07426+2323C"
{
	DateUpdated     "2024-07-17"
	ParentBody      "82 Gem"
	Parallax        3.1294
	AppMagn         13.5
	Class           ""
	AbsMagn         5.98 // 计算的值
	MassSol         1.03
}
